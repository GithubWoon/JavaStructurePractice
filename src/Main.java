public class Main {

	public static void main(String[] args) {

	    	MemberController controller = new MemberController(new MemberService(new MemberRepository()));

	    	controller.createNewMember(1L,"John Doe","johndoe@example.com");
            controller.createNewMember(2L, "hi", "hi@naver.com");

	    	controller.getSpecificMember(1L);
            controller.getSpecificMember(2L);

    	}

}
