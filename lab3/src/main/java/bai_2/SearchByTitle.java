package bai_2;

import java.util.ArrayList;
import java.util.List;

class SearchByTitle implements SearchStrategy {
    public List<Book> search(List<Book> books, String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }
}
