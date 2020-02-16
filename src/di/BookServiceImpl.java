package di;

public class BookServiceImpl implements BookService {
    //接口+setter
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook() {
        bookDao.addBook();
    }
}
