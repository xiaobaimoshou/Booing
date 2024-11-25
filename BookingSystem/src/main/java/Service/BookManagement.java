package Service;

import DTO.BookDTO;

public class BookManagement {


    public void add(BookDTO bookDTO){
        //save book basic info into book table;
    }

    public BookDTO query(){
        //use mock data
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookName("盗墓笔记");
        bookDTO.setBookUniqueId(12345L);
        bookDTO.setBookType(1);
        return bookDTO;
    }

    public boolean update(BookDTO bookDTO){
        if(bookDTO==null||bookDTO.getBookUniqueId()==null){
            throw new RuntimeException("Data can not be null");
        }
        //data base update basic info
        return true;
    }

    public void delete(Long id){
        //delete by id in database;
    }


}
