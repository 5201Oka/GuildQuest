package ctrl;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompleteServlet
 */
@WebServlet("/CompleteServlet")
public class CompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CompleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	/*
	 ============================================================================
	 [仕様書 4] クエスト完了・全体実績更新サーブレット
	 [プロジェクト名] GuildQuest
	 [ファイル名] CompleteServlet.java
	 [パッケージ] ctrl
	 [URLパターン] /CompleteServlet
	 
	 【役割】
	 クエスト完了の報告を受け取り、個人報酬の加算とギルド全体実績の更新を行う。
	 
	 【詳細要件】
	 ■ POSTリクエスト時:
	   1. リクエストの文字エンコーディングを "UTF-8" に設定。
	   2. セッションスコープから "adventurer" を取得。
	      ※ null の場合は未登録者のため、直ちに index.jsp へリダイレクトすること。
	   3. フォームから送信された "questType"（選択された討伐対象）を取得。
	   4. GuildManager のロジックを実行し、冒険者の所持ゴールドを更新するとともに、今回獲得した報酬額（reward）を受け取る。
	   5. アプリケーションスコープ（ServletContext）を取得し、"totalQuests"（ギルド全体の累計クリア数: Integer型）を更新する。
	      - null の場合 : 1 をセット
	      - null でない場合 : 現在の値に +1 して再セット
	   6. 今回の獲得報酬額（reward）を、リクエストスコープ（HttpServletRequest）に属性名 "reward" で保存。
	   7. /WEB-INF/jsp/quest.jsp へフォワード。
	 ============================================================================
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
