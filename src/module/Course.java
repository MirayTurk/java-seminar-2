package module;

public class Course {
	
	private long id;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 10000;
	
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
     public void setId() {
    	 id=counter;
    	 counter ++;
     }
     public void setTitle(String inputTitle) {
    	 if(inputTitle!=null)&& (!inputTitle.isEmpty()) && (inputTitle.matches("[A-Za-z 0-9]{3,100}")){
    		 title=inputTitle;
    	 }
     }
    
}
