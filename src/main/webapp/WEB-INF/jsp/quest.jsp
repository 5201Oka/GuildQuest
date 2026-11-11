<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%--
 ============================================================================
 [仕様書 6] クエスト受注・ステータス確認画面
 [プロジェクト名] GuildQuest
 [ファイル名] quest.jsp
 
 【役割】
 現在の冒険者ステータスの表示、クエスト実行フォーム、今回報酬の表示。
 
 【詳細要件】
 1. セッションスコープの "adventurer" から以下の情報をEL式等で表示すること。
    - 名前 (adventurer.name)
    - 職業 (adventurer.job)
    - 現在の所持ゴールド (adventurer.gold)
 2. クエスト実行フォームを配置すること。
    - 送信先: CompleteServlet, 送信方法: post
    - 討伐対象選択用セレクトボックス（name="questType"）
      選択肢: ドラゴン(dragon), ゴブリン(goblin), スライム(slime)
    - 送信ボタン: 「クエスト完了報告」
 3. 今回の討伐報酬表示（リクエストスコープ "reward" の判定）:
    - "reward" が存在する場合（emptyでない場合）:
      「クエスト成功！ 報酬として ${reward} Gold を獲得した！」 と表示すること。
 4. 画面下部に、アプリケーションスコープの "totalQuests"（ギルド全体クリア数）を表示すること。
 ============================================================================
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クエスト受注・ステータス確認</title>
</head>
<body>
	<h1>クエスト受注・ステータス確認</h1>
	<p>名前：${ adventurer.name }<br>
			職業：${ adventurer.job } <br>
			現在の所持ゴールド：${ adventurer.gold }
	</p>
	<form action="CompleteServlet" method="post">
		<select name="questType" id="questType">
			<option value="" disabled selected>選択してください</option>
			<option value="dragon">ドラゴン</option>
			<option value="goblin">ゴブリン</option>
			<option value="slime">スライム</option>
			<option value="その他">その他</option>
		</select>
		<input type="submit" value="クエスト完了報告">
	</form>
	
	
	<c:choose>
		<c:when test="${not empty reward }">
			<p>クエスト成功！ 報酬として ${reward} Gold を獲得した！</p>
		</c:when>
	</c:choose>
	
	<p>現在のギルド全体クリア数：${ totalQuests }</p>
</body>
</html>