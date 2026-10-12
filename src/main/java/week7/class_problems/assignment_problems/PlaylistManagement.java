public class PlaylistManagement {
    static class Playlist { private final String[] songs; private int count; Playlist(int size) { songs = new String[size]; } void addSong(String song) { if (count < songs.length) songs[count++] = song; } String[] getSongs() { String[] copy = new String[count]; System.arraycopy(songs, 0, copy, 0, count); return copy; } int getSongCount() { return count; } }
    public static void main(String[] args) { Playlist p = new Playlist(10); p.addSong("Song A"); p.addSong("Song B"); String[] copy = p.getSongs(); copy[0] = "Hacked"; for (String song : p.getSongs()) System.out.println(song); System.out.println("Song count: " + p.getSongCount()); }
}
