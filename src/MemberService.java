// 이곳은 Service 입니다
// 비즈니스 로직을 수행, 여러가지 DAO 를 사용하여 비즈니스 연산수행, 결과를 컨트롤러에게 전달

import java.util.Optional;

// 이 서비스는 저장소를 사용하여 멤버에 대한 연산을 수행합니다.
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

	// 새로운 멤버를 생성합니다.
	public void createMember(Long id, String name, String email) {
		Member newMember = new Member(id, name, email);
		memberRepository.save(newMember);
	}

	// 특정 멤버를 가져옵니다.
	public Optional<Member> getMember(Long memberId){
		return memberRepository.findById(memberId);
	}
}
