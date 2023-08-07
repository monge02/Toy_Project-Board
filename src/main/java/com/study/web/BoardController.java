package com.study.web;

import com.study.domain.Board;
import com.study.repository.SearchCond;
import com.study.repository.UpdateDto;
import com.study.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public String list(@ModelAttribute("searchCond") SearchCond searchCond, Model model) {
        List<Board> boards = boardService.findAll(searchCond);
        model.addAttribute("boards", boards);
        return "list";
    }


    @GetMapping("/list/{boardId}")
    public String board(@PathVariable Long boardId, Model model) {
        Board board = boardService.findById(boardId).get();
        model.addAttribute("board", board);
        return "details";
    }


    @GetMapping("/add")
    public String addForm() {
        return "addForm";
    }

    @PostMapping("/add")
    public String add(Board board, RedirectAttributes redirectAttributes) {
        Board savedBoard = boardService.save(board);
        redirectAttributes.addAttribute("boardId", savedBoard.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/board/list/{boardId}";
    }


    @GetMapping("/list/{boardId}/edit")
    public String editForm(@PathVariable Long boardId, Model model) {
        Board board = boardService.findById(boardId).get();
        model.addAttribute("board", board);
        return "editForm";
    }

    @PostMapping("/list/{boardId}/edit")
    public String edit(@PathVariable Long boardId, @ModelAttribute UpdateDto updateDto) {
        boardService.update(boardId, updateDto);
        return "redirect:/board/list/{boardId}";
    }
}
