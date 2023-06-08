package capstone.market.domain;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Post extends BaseEntity {
    @Id @GeneratedValue
    private Long postId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member who_posted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    protected Category category;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "tv_id")
//    private TogetherViewed togetherViewed;

    private CollegeType college;


    private TrackType track;




    private Integer price;

    private String post_title;
    private String post_text;



    private Integer views = 0;

    private Integer likes = 0;

    //위치
    private LocationType locationType;
    private String location_text;


    //이포스트를 조회한 유저 리스트
    @ElementCollection
    private Set<Long> viewedUserIds = new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY)
    @Nullable
    private Purchased purchased;

    @OneToMany(mappedBy = "post")
    private List<ChatRoom> chatRooms = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;



    @OneToMany(mappedBy = "post")
    private List<Image> images = new ArrayList<>();


    private String item_name; // 상품명

    private StatusType status; //  판매중, 거래예약, 거래완료

    private String reviewType; // 후기완료

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "image_id")
//    private Image image;
    // time
    // place
    // depart
    // image
    public Post() {
    }

    public Post(Member who_posted) {
        this.who_posted = who_posted;
    }

    public Post(String post_title, String post_text) {
        this.post_title = post_title;
        this.post_text = post_text;
    }

    public Post(Member who_posted, Category category, Integer price, String post_title, String post_text) {
        this.who_posted = who_posted;
        this.category = category;
        this.price = price;
        this.post_title = post_title;
        this.post_text = post_text;
//        this.image = image;
    }

    public void setImages(List<Image> images) {
        for (Image image : images) {
            image.setPost(this);
        }
    }
}
