package hackaton.ip_backend.service;

import hackaton.ip_backend.dto.response.MemberResponseDto;

import java.util.List;

public interface PurchaseService {

    MemberResponseDto.LeafDto purchaseLeaf(Long memberId, List<Long> productIdList);
}
