package test.aspectj.spring.di.fish;

public class FishImpl implements Fish {

	private String name;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;

	}

}
