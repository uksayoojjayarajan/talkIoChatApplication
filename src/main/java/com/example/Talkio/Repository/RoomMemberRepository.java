package com.example.Talkio.Repository;

import com.example.Talkio.model.RoomMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomMemberRepository extends JpaRepository<RoomMember, Long> { }
