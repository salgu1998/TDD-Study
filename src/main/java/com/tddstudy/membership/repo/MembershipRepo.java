package com.tddstudy.membership.repo;

import com.tddstudy.membership.entity.Membership;
import com.tddstudy.membership.util.MembershipKindType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepo extends JpaRepository<Membership, Long> {
    Membership findByUserIdAndKind(String userId, MembershipKindType kind);
    Membership save(Membership membership);
}
