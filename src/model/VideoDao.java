package model;

import java.util.ArrayList;

import model.vo.VideoVO;

public interface VideoDao {
	public void 		insertVideo(VideoVO vo, int count) throws Exception;
	public ArrayList    selectVideo(int idx, String word) throws Exception;
	public VideoVO  	selectByVnum(int vnum)throws Exception;
	
	public  int    modifyVideo(VideoVO vo)throws Exception;
	public  int  deleteVideo(int vnum)throws Exception;
	
}
