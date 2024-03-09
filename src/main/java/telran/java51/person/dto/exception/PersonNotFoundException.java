package telran.java51.person.dto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = -7424937465016547281L;
	
	

}