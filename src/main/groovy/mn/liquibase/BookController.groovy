package mn.liquibase

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus


@Controller("/book")
class BookController {
    BookService bookService
    
    BookController(BookService bookService) {
        println "bookService: ${bookService}"
        this.bookService = bookService
    }
    
    @Get("/")
    HttpStatus index() {
        return HttpStatus.OK
    }
}