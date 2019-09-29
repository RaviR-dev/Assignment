package com.test.assn.spring4.controller;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.assn.spring4.model.Book;
import com.test.assn.spring4.model.Subject;
import com.test.assn.spring4.repository.BookRepository;
import com.test.assn.spring4.repository.SubjectRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@RequestMapping(value = "/addbooklink", method = RequestMethod.GET)
	public ModelAndView addBookLink(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("addbook", "book", new Book());
	}
	
	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public ModelAndView addBook(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("book") Book book) {
		String status = null;
		try {
			bookRepository.save(book);
			status = "Book added successfully";
		} catch (Exception e) {
			e.printStackTrace();
			status = "Book add failed";
		}
		return new ModelAndView("status", "status", status);
	}
	
	@RequestMapping(value = "/searchbook/{bookId}", method = RequestMethod.POST)
	public ModelAndView searchbook(HttpServletRequest request, HttpServletResponse response, @PathVariable("bookId") long bookId) {
		Book book = bookRepository.findById(bookId).get();
		return new ModelAndView("searchbook", "book", book);
	}
	
	@RequestMapping(value = "/searchsubject/{subjectId}", method = RequestMethod.POST)
	public ModelAndView searchSubject(HttpServletRequest request, HttpServletResponse response, @PathVariable("subjectId") long subjectId) {
		Subject subject = subjectRepository.findById(subjectId).get();
		return new ModelAndView("searchsubject", "subject", subject);
	}
	
	@RequestMapping(value = "/deletebook/{bookId}", method = RequestMethod.POST)
	public ModelAndView deletebook(HttpServletRequest request, HttpServletResponse response, @PathVariable("bookId") long bookId) {
		String status = null;
		try {
			bookRepository.deleteById(bookId);
			status = "Book deleted successfully";
		} catch(Exception e) {
			e.printStackTrace();
			status = "Book deletion failed";
		}
		return new ModelAndView("status", "status", status);
	}
	
	@RequestMapping(value = "/deletesubject/{subjectId}", method = RequestMethod.POST)
	public ModelAndView deleteSubject(HttpServletRequest request, HttpServletResponse response, @PathVariable("subjectId") long subjectId) {
		String status = null;
		try {
			subjectRepository.deleteById(subjectId);
			status = "Subject deleted successfully";
		} catch(Exception e)  {
			e.printStackTrace();
			status = "Subject deletion failed";
		}
		return new ModelAndView("status", "status", status);
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
	      @Override
	      public void setAsText(String text) throws IllegalArgumentException {
	    	  setValue(LocalDate.parse(text, DateTimeFormatter.ISO_DATE));
	      }
	    });
	}

}
