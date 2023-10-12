// 이곳은 DTO 입니다
// 데이터 교환을 위한 객체, 데이터베이스에서 가져온 객체를 자바에서 다루기 위해 사용
// 읽기전용 속성, getter/setter 메서드만 가지고 있음

public class MemberDTO {

  private Long id;

  private String name;

  private String email;


  // 생성자

  public MemberDTO(Long id, String name, String email) {

      this.id = id;

      this.name = name;

      this.email = email; 

  } 

  
// Getter and Setter 메서드

public Long getId() {

      return id; 

} 

public void setId(Long id) { 

     this.id= id; 
     
}  

public String getName() {  

     return name;  
     
}  

public void setName(String name) {   

     this.name= name;  
     
}  

public String getEmail(){   

     return email;   
     
}   

public void setEmail(String Email){    

     this.email=Email;    
     
}
}