package ex02v2;

import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData2 dbData1 = new DBData2(1, "제목1", "내용1", 1, "댓글1");
        DBData2 dbData2 = new DBData2(1, "제목1", "내용1", 2, "댓글2");
        DBData2 dbData3 = new DBData2(1, "제목1", "내용1", 3, "댓글3");

        List<DBData2> dbList = Arrays.asList(dbData1, dbData2, dbData3);

        if (dbList.size()==0){
            return;
        }//없을때 종료해야함

        ViewData2 viewData2 =new ViewData2(dbList);

        System.out.println(viewData2);
    }
}
