<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%--
 ============================================================================
 [仕様書 5] ギルド受付・冒険者登録画面
 [プロジェクト名] GuildQuest
 [ファイル名] index.jsp
 
 【役割】
 冒険者の新規登録フォームの表示と、ギルド全体の累計クリア実績の表示。
 
 【詳細要件】
 1. 冒険者登録フォームを配置すること。
    - 送信先: QuestServlet, 送信方法: post
    - 入力項目: 氏名テキストボックス（name="name"）
    - 選択項目: 職業セレクトボックス（name="job" / 選択肢: 戦士, 魔法使い, 修道士 など）
    - 送信ボタン: 「冒険者登録」
 2. セッションスコープに "adventurer" が存在する場合（登録済み）:
    - フォームを非表示にし、「すでに登録済みです」というメッセージと、
      クエスト画面へ進むリンク（href="QuestServlet"）を表示すること。
 3. アプリケーションスコープの "totalQuests"（累計クエスト達成数）をEL式で表示すること。
    - 未設定（empty）の場合は 「まだ達成されたクエストはありません」 と表示制御すること。
 ============================================================================
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>冒険者登録フォーム</title>
</head>
<body>
	<h1>冒険者登録フォーム</h1>
	

	
	<c:choose>
		<c:when test="${ not empty adventurer }">
			<p>すでに登録済みです</p>
			<a href="QuestServlet">クエスト画面へ進む</a>
		</c:when>
		
		<c:otherwise>
			<form action="QuestServlet" method="post">
		氏名：<input type="text" name="name"><br>
		職業：<select name="job" id="job">
				  <option value="" disabled selected>選択してください</option>
				  <option value="戦士">戦士</option>
				  <option value="魔法使い">魔法使い</option>
				  <option value="修道士">修道士</option>
				</select><br>
				<input type="submit" value="冒険者登録">
	</form>
		</c:otherwise>
	</c:choose>
	
	<c:choose>
		<c:when test="${ not empty totalQuests }">
			<p>現在のギルド全体クリア数：${ totalQuests }</p>
		</c:when>
		<c:otherwise>
			<p>まだ達成されたクエストはありません</p>
		</c:otherwise>
	</c:choose>
</body>
</html>