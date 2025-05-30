package sb.for_git.controllers;
 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping
public class HomeController {
	
	@GetMapping("/")
	public ResponseEntity<String> welcome () {
		
		return ResponseEntity.ok("welcome to git");
	}
	
	@GetMapping("/welcomeAgain")
	public ResponseEntity<String> welcomeAgain() {
		return ResponseEntity.ok("Welcome Again");
	}
 
}
 
 