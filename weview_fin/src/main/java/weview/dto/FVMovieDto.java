package weview.dto;

public class FVMovieDto {
	
	private int seqfv;
	private int seqmember;
	private int movieseq;
	
	public FVMovieDto() {}
	
	public FVMovieDto(int seqfv, int seqmember, int movieseq) {
		super();
		this.seqfv = seqfv;
		this.seqmember = seqmember;
		this.movieseq = movieseq;
	}

	public int getSeqfv() {
		return seqfv;
	}

	public void setSeqfv(int seqfv) {
		this.seqfv = seqfv;
	}

	public int getSeqmember() {
		return seqmember;
	}

	public void setSeqmember(int seqmember) {
		this.seqmember = seqmember;
	}

	public int getMovieseq() {
		return movieseq;
	}

	public void setMovieseq(int movieseq) {
		this.movieseq = movieseq;
	}

	@Override
	public String toString() {
		return "FVMovieDto [seqfv=" + seqfv + ", seqmember=" + seqmember + ", movieseq=" + movieseq + "]";
	}
	
	
	
}

	
	
	
