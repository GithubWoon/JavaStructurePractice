// 이곳은 Controller 입니다
// 클라이언트 요청처리, 응답 반환

import java.util.Optional;

// 이 컨트롤러는 서비스를 사용하여 사용자와 상호작용합니다.
public class MemberController {
	private MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	public void createNewMember(Long id, String name, String email) {
		memberService.createMember(id, name, email);
		System.out.println("새로운 사용자 생성: " + name + ", " + email);
	}

	public void getSpecificMember(Long memberId){
	    Optional<Member> optionalUser =  memberService.getMember(memberId);

	    if(optionalUser.isPresent()){
	        System.out.println("사용자 발견: " + optionalUser.get().getName() + ", " + optionalUser.get().getEmail());
	    } else{
	        System.out.println("사용자를 찾을 수 없습니다");
	    }
	    
   }
}
