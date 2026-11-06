package ctrl;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuestServlet
 */
@WebServlet("/QuestServlet")
public class QuestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/*
	============================================================================
	[仕様書 3] 冒険者登録・マイページ制御サーブレット
	[プロジェクト名] GuildQuest
	[ファイル名] QuestServlet.java
	[パッケージ] ctrl
	[URLパターン] /QuestServlet
	
	【役割】
	冒険者の新規登録処理と、クエスト画面へのアクセス制御を行う。
	
	【詳細要件】
	■ POSTリクエスト時（フォームからの新規登録）:
	  1. リクエストの文字エンコーディングを "UTF-8" に設定。
	  2. フォームから送信された "name"（名前）と "job"（職業）を取得。
	  3. Adventurer インスタンスを生成し、名前と職業をセット（所持金は初期値0）。
	  4. セッションスコープ（HttpSession）を取得し、属性名 "adventurer" で保存。
	  5. /WEB-INF/jsp/quest.jsp へフォワード。
	
	■ GETリクエスト時（ログイン状態でのアクセス判定）:
	  1. セッションスコープから "adventurer" を取得。
	  2. "adventurer" が存在する場合（ログイン済み）:
	     /WEB-INF/jsp/quest.jsp へフォワード。
	  3. "adventurer" が null の場合（未登録・未ログイン）:
	     トップ画面（index.jsp）へリダイレクト。
	============================================================================
	*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
