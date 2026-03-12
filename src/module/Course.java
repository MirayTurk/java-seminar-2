package module;

public class Course {
	
	private long id;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 0;
	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
    public Professor getProfessor() {
    	return professor;
    }
  //  public void 
    
    
}
