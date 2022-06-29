package com.example.data.remote;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class NbaTeamItemResponse{

	@SerializedName("NbaTeamItemResponse")
	private List<NbaTeamItem> nbaTeamItemResponse;

	public void setNbaTeamItemResponse(List<NbaTeamItem> nbaTeamItemResponse){
		this.nbaTeamItemResponse = nbaTeamItemResponse;
	}

	public List<NbaTeamItem> getNbaTeamItemResponse(){
		return nbaTeamItemResponse;
	}
}