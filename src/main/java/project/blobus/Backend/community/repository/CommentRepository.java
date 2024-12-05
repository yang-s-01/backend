package project.blobus.Backend.community.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project.blobus.Backend.community.entity.CommunityComment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<CommunityComment, Integer> {

    Optional<CommunityComment> findById (Long CommentId);

//    @Query ("select c from CommunityComment c where c.post.Id = :boardId")
//    List<CommunityComment> findByPostId(@Param("postId") Long postId);

    //  댓글 수 총합
//    @Query ("SELECT COUNT(c) from CommunityComment c where c.postId=:id")
//    Integer countComment(@Param("id") Long postId);
}
