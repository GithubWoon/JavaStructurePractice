// 이곳은 ENTITY 입니다
// 데이터베이스 테이블의 한 행을 나타내는 자바 객체, 데이터베이스에서 가져온 코드를 자바에서 다루기 위해 사용


public class Member {
    private Long id;
    private String name;
    private String email;

    public Member(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

   // 게터/세터 등 필요한 코드 작성
   public Long getId() {
       return this.id;
   }

   public void setId(Long id) {
       this.id = id;
   }

   public String getName() {
       return this.name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getEmail() {
       return this.email;
   }

   public void setEmail(String email) {
       this.email = email;
  }
}
