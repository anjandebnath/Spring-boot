### RESTFUL Webservice controller vs traditional MVC
1. A key difference between a traditional MVC controller and the RESTful web service controller shown earlier is the way that the ```HTTP response body is created```. Rather than relying on a view technology to perform server-side rendering of the greeting data to HTML, this RESTful web service controller populates and returns a ```Greeting object```. The ```object data will be written directly to the HTTP response as JSON```.
2. Spring ```@RestController annotation```, which marks the class as a controller where every method returns a ```domain object``` instead of a ```view```. It is shorthand for including both @Controller and @ResponseBody.

### Fetching a REST resource
1. A more useful way to consume a ```REST web service``` is programmatically. To help you with that task, Spring provides a convenient template class called ```RestTemplate```
