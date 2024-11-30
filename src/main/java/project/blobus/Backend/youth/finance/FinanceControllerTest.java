package project.blobus.Backend.youth.finance;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/youth/finance")
public class FinanceControllerTest {

    private final FinanceServiceTest financeServiceTest;

    // 페이징된 정책게시물 가져오기
    @GetMapping("/paged-policies")
    public Page<FinanceDTOTest> getPagedPolicies(
            @RequestParam(defaultValue = "0") int page,           // 페이지 번호
            @RequestParam(defaultValue = "10") int size,          // 페이지 크기
            @RequestParam(defaultValue = "") String keyword,      // 검색어 (기본값: 빈 문자열)
            @RequestParam(defaultValue = "전체") String category  // 기본값 "전체"
    ) {
        Pageable pageable = PageRequest.of(page , size);                         // 페이징 객체 생성
        return financeServiceTest.getPagedPolicies(keyword, category, pageable); // 서비스 호출
    }

    // 모든 정책 가져오기
    @GetMapping("/policies")
    public List<FinanceDTOTest> getAllPolicies() {
        return financeServiceTest.getAllPolicies();
    }

    // 특정 ID의 정책 가져오기
    @GetMapping("/policies/{id}")
    public FinanceDTOTest getPolicyById(@PathVariable Integer id) {
        return financeServiceTest.getPolicyById(id);
    }
}
