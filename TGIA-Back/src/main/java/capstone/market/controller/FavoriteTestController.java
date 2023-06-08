
//package capstone.market.controller;
//
//import capstone.market.domain.Favorite;
//import capstone.market.domain.Member;
//import capstone.market.domain.Post;
//import capstone.market.service.FavoriteService;
//import capstone.market.service.MemberService;
//import capstone.market.service.PostService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@Slf4j
//@RequiredArgsConstructor
//public class FavoriteTestController {
//    private final FavoriteService favoriteService;
//    private final MemberService memberService;
//    private final PostService postService;
//
//    @PostMapping("/profile/add_favorite")   //좀 애매 하네 어디서든 지 포스트 검색 할 수 있음
//    public void addFavorite(@RequestParam Long postId, @RequestParam Long userId) {
//
//        Member user = memberService.findOne(userId);
//        Post post = postService.findPostByPostId(postId);
////        post.setLikes(post.getLikes()+ 1);
//        Favorite favorite = new Favorite(user, post);
//        user.getFavorites().add(favorite);
//    }
//
//
//    @GetMapping("/profile/favorite_list")
//    public List<PostController.PostListResponse> listFavorite(@RequestParam("userId") Long userId) {
//        Member user = memberService.findOne(userId);
//        List<Favorite> favorites = user.getFavorites();
//
//        List<Post> posts = new ArrayList<>();
//
//        for(Favorite favorite : favorites){
//
//            Long postId = favorite.getPost().getPostId();
//
//            posts.add(postService.findPostByPostId(postId));
//
//        }
//
//        List<PostController.PostListResponse> result = posts.stream()
//                .map(p -> new PostController.PostListResponse(p))
//                .collect(Collectors.toList());
//
//        return result;
//    }
//
//    //좋아요 삭제
//    @DeleteMapping("/profile/delete_favorite")   //좀 애매 하네 어디서든 지 포스트 검색 할 수 있음
//    public void deleteFavorite(@RequestParam Long favoriteId) {
////        Favorite findFavorite = favoriteService.findById(favoriteId);
////        findFavorite.getPost().setLikes(findFavorite.getPost().getLikes()-1);
//        favoriteService.delete(favoriteId);
//    }
//}
