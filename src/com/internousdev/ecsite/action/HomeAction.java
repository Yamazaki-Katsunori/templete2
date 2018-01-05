package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	/**
	 * ログインボタン押下時に実行 ログイン画面へ遷移します。
	 *
	 * @return SUCCESS
	 */
	public String execute() {
		String result = "login";
		if (session.containsKey("id")) {
			// アイテム情報を取得
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemeInfo();

			session.put("id", buyItemDTO.getId());
			session.put("buyitem_name", buyItemDTO.getItemName());
			session.put("buyitem_price", buyItemDTO.getItemPrice());

			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setsession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getssession() {
		return this.session;
	}
}
