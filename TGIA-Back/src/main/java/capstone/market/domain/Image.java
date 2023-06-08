package capstone.market.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter @Setter
public class Image {
    @Id @GeneratedValue
    private Long id;
    private String imageFilename;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @OneToOne(mappedBy = "image", fetch = FetchType.LAZY)
    private Member member;

    public Image(String imageFilename) {
        this.imageFilename = imageFilename;
    }

    public Image(String imageFilename, Post post) {
        this.imageFilename = imageFilename;
        this.post = post;
    }
}
