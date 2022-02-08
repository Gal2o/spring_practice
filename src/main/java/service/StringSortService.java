package service;

import java.util.List;
import logic.Sort;

public class StringSortService {

    // setter는 final 사용 금지 -> 수정 권한을 주기 때문이다.
    // Autowired도 final 사용 금지
    private final Sort<String> sort;

    public StringSortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> input) {
        return sort.sort(input);
    }
}
