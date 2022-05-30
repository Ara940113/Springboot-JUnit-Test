package site.metacoding.blogv4junit.domain.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
public class Book {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id; // 맵핑 타입을 쓰면 널이면 안들어온다.
    private String title;
    private String author;

    @Builder // 빌더를 쓰면 순서가 맞지 않아도 쓸 수 있다.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 디폴트 생성자를 없앤다. 쓸일이 없는건 안만들기!

}
