package fun.domain.vote.post.domain;

import fun.domain.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class VoteAssignHostValidator {

    private final MemberRepository memberRepository;

    void validate(final Long memberId) {
        if (!memberRepository.existsById(memberId)) {
            throw new IllegalStateException("투표 게시글 생성에 필요한 개최자를 사용자 식별자값으로 조회할 수 없습니다.");
        }
    }
}