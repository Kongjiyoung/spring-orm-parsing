package ex02;

import ex02.model.Reply;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class ViewData2 {
    private int boardId;
    private String title;
    private String content;

    private  List<Reply> replies=new ArrayList<>();
    // Board 데이터만 넣는 생성자

    public ViewData2(int boardId, String title, String content) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
    }

    public void addReply(Reply r) {
        replies.add(r);
    }
}