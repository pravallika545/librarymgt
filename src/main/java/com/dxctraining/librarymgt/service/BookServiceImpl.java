package com.dxctraining.librarymgt.service;


import com.dxctraining.librarymgt.dao.BookDaoImpl;
import com.dxctraining.librarymgt.dao.IBookDao;
import com.dxctraining.librarymgt.entities.Book;
import com.dxctraining.librarymgt.exceptions.BookNotFoundException;
import com.dxctraining.librarymgt.exceptions.InvalidBookArgumentException;


import java.util.List;

public  class BookServiceImpl implements BookService {
private IBookDao bookDao=new BookDaoImpl();
    @Override
    public Book findBookId(String id) {
        validateId(id);
        Book book=bookDao.findBookId(id);
        return book;
    }

    private void validateId(String id) {
        if(id==null || id.isEmpty())
        {
            throw new InvalidBookArgumentException("Id can't be null or empty");
        }
    }

    @Override
    public Book updateBookcost(String id, double cost) {
        validateId(id);
        validatecost(cost);
        Book book=bookDao.updateCost(id,cost);
        return book;
    }

    private void validatecost(double cost) {
        if(cost<0)
        {
            throw new BookNotFoundException("The cost can't be negative");
        }
    }

    @Override
    public void removeBook(String id) {
        validateId(id);
        bookDao.removeBook(id);

    }

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public List<Book> showBooks() {
       List<Book>list=bookDao.showBooks();
       return list;
    }
}