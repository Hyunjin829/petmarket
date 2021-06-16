package com.javateam.pet_project.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javateam.pet_project.dto.Member;
import com.javateam.pet_project.entity.Comment;
import com.javateam.pet_project.entity.CommentDto;
import com.javateam.pet_project.entity.Shop;
import com.javateam.pet_project.entity.ShopDto;
import com.javateam.pet_project.service.MemberService;
import com.javateam.pet_project.service.ShopService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PostController {

	@Autowired
	private ShopService service;

	@Autowired
	private MemberService memberService;

	/*
	 * @Autowired private MybatisShopDao mybatisShopDao;
	 */

	/*
	 * @Autowired FilesService filesService;
	 */

	/*
	 * localhost:8383/post 글쓰기
	 */
	@RequestMapping(value = "post", method = RequestMethod.GET)
	public String post() {
		return "post";
	}

	@RequestMapping(value = "/postAction", method = RequestMethod.POST)
	public String postAction( ShopDto shop) throws IllegalStateException, IOException {

		log.info("postAction");
		log.info("shop:" + shop);

		log.info("filepath:" + shop.getProductImage().getOriginalFilename());

		// String PATH = request.getSession().getServletContext().getRealPath("/") +
		// "resources/"; //절대경로로 변경

		String PATH = "C:/baezzi/goodee/works/java1/pet_project/src/main/resources/static/images/";

		if (!shop.getProductImage().getOriginalFilename().isEmpty()) {
			shop.getProductImage().transferTo(new File(PATH + shop.getProductImage().getOriginalFilename()));
		}

		Calendar c = Calendar.getInstance();

		// Q1) productNumber() sequence사용해서 ++ 로직 실행하기
		// private static long sequence = 0L; //static 사용
		// shop.setProductNumber(++sequence);

		service.productInsert(new Shop(shop.getProductNumber(), shop.getProductName(), shop.getProductPrice(),
				shop.getProductDescription(), shop.getSeller(), c.getTime(),
				shop.getProductImage().getOriginalFilename(), shop.getPetType(), shop.getProductCategory()));

		return "redirect:/myPostView";

	}

	/*
	 * @RequestMapping("shop/post/insert") public String Insert() {
	 * 
	 * return "shop/post/insert"; }
	 * 
	 * @RequestMapping("post/fileinsert") public String
	 * fileinsert(HttpServletRequest request, @RequestPart MultipartFile files)
	 * throws Exception{ Files file = new Files();
	 * 
	 * String sourceFileName = files.getOriginalFilename(); String
	 * sourceFileNameExtension =
	 * FilenameUtils.getExtension(sourceFileName).toLowerCase(); File
	 * destinationFile; String destinationFileName;
	 * //C:/baezzi/goodee/works/java1/pet_project/src/main/resources/static/images/
	 * String fileUrl =
	 * "C:/baezzi/goodee/works/java1/pet_project/src/main/resources/static/images/";
	 * // 자기 프로젝트이름으로 체인지!!
	 * 
	 * do { destinationFileName = RandomStringUtils.randomAlphanumeric(32) + "." +
	 * sourceFileNameExtension; destinationFile = new File(fileUrl +
	 * destinationFileName); } while (destinationFile.exists());
	 * 
	 * destinationFile.getParentFile().mkdirs(); files.transferTo(destinationFile);
	 * 
	 * file.setFilename(destinationFileName);
	 * //System.out.println("destinationFileName : " + destinationFileName);
	 * file.setFileOriName(sourceFileName); //System.out.println("sourceFileName : "
	 * + sourceFileName); file.setFileurl(fileUrl);
	 * //System.out.println("fileUrl : " + fileUrl); filesService.save(file);
	 * 
	 * return "redirect:post";
	 * 
	 * }
	 */

	/*
	 * localhost:8383/myPostView 내글목록
	 */
	@RequestMapping("/myPostView")
	public String myPostview(HttpServletRequest request, Model model) {

		HttpSession session = request.getSession();

		Integer loginedMemberId = (Integer) session.getAttribute("loginedMemberId");
		
		log.info("sessionLoginId " + loginedMemberId);
		
		Member member = memberService.getMemberById(loginedMemberId);
		request.setAttribute("loginedMemberName", member.getMemberName());
		
		log.info("loginedMemberName " + member.getMemberName());
		String loginedMemberName = member.getMemberName();

		 List<Shop> list = service.getListBySeller(loginedMemberName); //mylist로 바꿔주기

		 model.addAttribute("list",list);
		 
		 log.info("list" + list);
		return "myPostView";
	}

	/*
	 * @RequestMapping("/myPostView") public String myPostView(Model model) {
	 * 
	 * //memberId를 가져와서 넣어주기
	 * 
	 * List<Shop> list = service.getListByUser(memberId); model.addAttribute("list",
	 * list);
	 * 
	 * return "myPostView"; }
	 */

	/*
	 * localhost:8383/myPostUpdate 내글목록 - 상품수정
	 */
	@RequestMapping("/myPostUpdate")
	public String myPostUpdate(@RequestParam("productName") String productName, Model model) {
		log.info("productName : " + productName);
		List<Shop> list = service.getListDetail(productName);
		model.addAttribute("list", list);
		return "myPostUpdate";
	}

	@RequestMapping(value = "/postUpdateAction", method = RequestMethod.POST)
	public String postUpdateAction(HttpServletRequest request, HttpServletResponse response, ShopDto shop) throws IllegalStateException, IOException {

		log.info("postUpdateAction");
		log.info("shop:" + shop);

		/*if (shop.getProductImage() == null) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('사진을 등록해주세요(필수)'); location.href='myPostUpdate';</script>");
			out.flush();
		}*/

		log.info("filepath:" + shop.getProductImage().getOriginalFilename());

		String PATH = "C:/baezzi/goodee/works/java1/pet_project/src/main/resources/static/images/";

		if (!shop.getProductImage().getOriginalFilename().isEmpty()) {
			shop.getProductImage().transferTo(new File(PATH + shop.getProductImage().getOriginalFilename()));
		}

		Calendar c = Calendar.getInstance();

		service.productUpdate(new Shop(shop.getProductNumber(), shop.getProductName(), shop.getProductPrice(),
				shop.getProductDescription(), "baejiyoung", c.getTime(), shop.getProductImage().getOriginalFilename(),
				shop.getPetType(), shop.getProductCategory()));

		return "redirect:/myPostView";

	}

	/*
	 * localhost:8383/myPostUpdate 내글목록 - 상품삭제
	 */
	@RequestMapping("/myPostDelete")
	public String myPostDelete(@RequestParam("productName") String productName, Model model,
			HttpServletResponse response) {
		log.info("productName : " + productName);
		service.productDelete(productName);

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("<script>alert('삭제되었습니다'); location.href='/myPostView'; </script>");
			out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "redirect:/myPostView";

	}
	@RequestMapping(value = "/commentAction", method = RequestMethod.POST)
	public String commentAction(CommentDto comment) {
		
		log.info("commentAction");
		log.info("commentDto:" + comment);
		
		service.commentInsert(new Comment(comment.getCommentNumber(), comment.getMemberId(), comment.getMemberNickname(), comment.getMessage(), comment.getWriteDate(), comment.getProductName())); 
				
		
		//return "redirect:/shopDetail?productName={}";
		return "redirect:/myPostView";
	}
}