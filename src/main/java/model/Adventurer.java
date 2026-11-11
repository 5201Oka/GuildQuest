package model;

import java.io.Serializable;

/*
============================================================================
[仕様書 1] 冒険者モデル
[プロジェクト名] GuildQuest
[ファイル名] Adventurer.java
[パッケージ] model

【役割】
冒険者1人のステータス（名前、職業、所持ゴールド）を保持するデータ保持用クラス（JavaBean）。

【詳細要件】
1. java.io.Serializable インターフェースを実装すること。
2. 以下の private フィールドを定義すること。
   - name (String) : 冒険者の名前
   - job (String)  : 職業（戦士、魔法使い、修道士 など）
   - gold (int)    : 所持ゴールド
3. 引数なしコンストラクタを定義し、初期値として gold を 0 に設定すること。
4. すべてのフィールドに対する Getter および Setter を定義すること。
============================================================================
*/
public class Adventurer implements Serializable{
	//フィールド
	private String name;
	private String job;
	private int gold;
	
	public Adventurer() {
		gold = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	
}
