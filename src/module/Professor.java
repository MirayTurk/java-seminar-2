package module;

public class Professor {

    private long id;
    private String name;
    private String surname ;
    private ProfDegree degree;
    
    private static long counter = 0;

    public long getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    public String getSurname() {
    	return surname;
    }
    public ProfDegree getDegree() {
    	return degree;
    }
    
    public void setId() {
    	id=counter;
    	counter++;
    }
    
    public void setName(String inputName) {
		if( (inputName != null) && (!inputName.isEmpty()) 
			&& (inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			name = inputName;
		}
		else
		{
			name = "Unknown";
		}
		
	}

	public void setSurname(String inputSurname) {
		if( (inputSurname != null) && (!inputSurname.isEmpty()) 
			&& (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			surname = inputSurname;
		}
		else
		{
			surname = "Unknown";
		}
	}
	public void setDegree(ProfDegree inputDegree) {
		if (inputDegree !=null) {
			degree = ProfDegree.unknown;
		}
	}
	
	public Professor() {
		setId();
		setName("Karina");
		setSurname("Skirmante");
		setDegree(ProfDegree.master);
	}
	public Professor (String inputName,String inputSurname,ProfDegree inputDegree) {
		setId();
		setName(inputName);
		setSurname(inputSurname);
		setDegree(inputDegree);
		
	}
	public String toString() {
	 	String result =id  + " :" + name +  " " + surname + String result =id + ":" + name +  " " + surname +  " (" + degree + ")";
	 	return result;
	}
   }

    
	