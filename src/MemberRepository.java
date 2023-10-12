// 이곳은 DAO 입니다
// 데이터베이스 접근로직 캡슐화, CRUD 데이터베이스 연산 메서드 제공

import java.util.*;

// 이것은 매우 기본적인 데이터베이스 저장소의 시뮬레이션입니다.
// 실제 애플리케이션에서는 여기서 JPA 또는 다른 데이터베이스 라이브러리를 사용합니다.
public class MemberRepository {

    private Map<Long, Member> databaseSimulator = new HashMap<>();

    // 멤버를 "데이터베이스"에 저장합니다.
    public void save(Member member){
        databaseSimulator.put(member.getId(), member);
    }
    
	// "데이터베이스"에서 멤버를 찾습니다.
	public Optional<Member> findById(Long memberId){
		return Optional.ofNullable(databaseSimulator.get(memberId));
	}

}
