@RestController
@Controller
@RequestMapping(value = "/api")
public class BookMappingController {

    public BookMappingController() {
        super();
    }



    @RequestMapping(value = "/books")
    @ResponseBody
    public String getBooksBySimplePath() {
        return "Here's your book!";
    }



    @RequestMapping(value = "/book/{id}")
    @ResponseBody
    public String getBooksBySimplePathWithPathVariable(@PathVariable final long id) {
        return "Get a specific Book with id=" + id;
    }
    
    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE )
    @ResponseBody
    public String deleteBooksBySimplePathWithPathVariable(@PathVariable final long id) {
        return "Delete a specific Book with id=" + id;
    }
    
    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT )
    @ResponseBody
    public String putBooksBySimplePathWithPathVariable(@PathVariable final long id) {
        return "Put a specific Book with id=" + id;
    }

    @RequestMapping(value = "/book/title/{booktitle}")
    @ResponseBody
    public String getBooksBySimplePathWithPathVariables(@PathVariable final String booktitle) {
        return "Get a specific Book with title=" + booktitle;
    }

    @RequestMapping(value = "/book/title/", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public String getBook() {
    return "Get Book with Specific Book Title with JSON";
    }


    @RequestMapping(value = "/book/create", method = RequestMethod.POST)
    @ResponseBody
    public String postBook() {
        return "Post some Books";
    }



    @RequestMapping(value = "/book", headers = { "key1=name", "key2=publish" })
    @ResponseBody
    public String getBookWithHeaders() {
        return "Get some Book with Header name and publish";
    }
