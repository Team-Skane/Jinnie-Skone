package cart.cart_system;

public class CartDTO {
    //Entity
    private int postID;
    private int productNumber;
    private String postName;
    private String postText;
    private String postDate;
    private boolean pickPost;

    //getter & setter CartCategory
    public int getPostID() {return postID;}
    public void setPostID(int postID) {this.postID = postID;}

    public int getProductNumber() {return productNumber;}
    public void setProductNumber(int productNumber) {this.productNumber = productNumber;}

    public String getPostName() {return postName;}
    public void setPostName(String postName) {this.postName = postName;}

    public String getPostText() {return postText;}
    public void setPostText(String postText) {this.postText = postText;}

    public String getPostDate() {return postDate;}
    public void setPostDate(String postDate) {this.postDate = postDate;}

    public boolean isPickPost() {return pickPost;}
    public void setPickPost(boolean pickPost) {this.pickPost = pickPost;}

    //Console TEST
    @Override
    public String toString() {
        return "CartDTO{" +
                "postID=" + postID +
                ", productNumber=" + productNumber +
                ", postName='" + postName + '\'' +
                ", postText='" + postText + '\'' +
                ", postDate='" + postDate + '\'' +
                ", pickPost=" + pickPost +
                '}';
    }
}
