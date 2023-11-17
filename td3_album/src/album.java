package src;
public class album{
    /**
     *Add new track to album
     *
     * @param track to add
     * @exception AlbumIsFinishedExcspetion if album.finished
     */
    public void addTrack(Track track) throws AlbumIsFinishedExcspetion{
        if this.finished(){
            throw nex AlbumIsFinishedExcspetion();
        }
        int i = 0;
        while (this.track[i] != null){
            i++;
        }
        this.track[i] = track;
    }

    public int totalDuration(){}
}