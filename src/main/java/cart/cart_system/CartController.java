package cart.cart_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
public class CartController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 나중에 productNumber 추가해야 됨, fk 참조를 해야되서 지금은 참조 무결성 에러가 발생하기에 제외함
    @PostMapping("/save")
    public void getDTO(@RequestParam("postName") String postName,
                       @RequestParam("postText") String postText,
                       @RequestParam("postDate") String postDate){

        String sql = "INSERT INTO scone.POST(postName, postText, postDate)" +
                "VALUES(?,?,?)";

        //전달 받은 값을 DB에 insert
        Object[] params = {postName,postText,postDate};
        jdbcTemplate.update(sql, params);

        System.out.println("전송완료!");
    }

    @PostMapping("/delete")
    public void delDTO(){

        String sqlDel = "DELETE FROM scone.POST";
        //DB TABLE DELETE
        jdbcTemplate.update(sqlDel);

        System.out.println("삭제완료!");
    }


}








