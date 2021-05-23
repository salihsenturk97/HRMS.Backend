package kodlamaio.Hrms.core.utilities.results;

public class Result {
	
	private boolean success ;
	private String message ;
	
	
	public Result(boolean success) {
		
		this.success = success;
		
	}
	public Result(boolean success,String message) {
		//this.success = success;
		this(success); // yukarıdaki yerine bunu kullandık.
		this.message = message;
	}
	
	public boolean isSucces() {
		return this.success;
	}

	public String getMessage() {
		return this.message; 
	}
}
