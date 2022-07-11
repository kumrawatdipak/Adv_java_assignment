package com.cdac.song;

public class AlbumSongEcample {
	public static void main(String[] args) {

		// GenericDao dao = new GenericDao(); // adding a album
		/*
		 * Album album = new Album(); album.setName("Hit song of 2019");
		 * album.setReleaseDate(LocalDate.of(2019, 05, 06));
		 * album.setCopyright("khot production "); dao.save(album);
		 */

		GenericDao dao = new GenericDao();
		Album album = (Album) dao.fetchById(Album.class, 2);
		Song song = new Song();
		song.setTitle("Rabba kheria ");
		song.setArtist("paras arora");
		song.setDuration(3.00);
		song.setAlbum(album);
		dao.save(song);

		Album album1 = (Album) dao.fetchById(Album.class, 3);
		Song song1 = new Song();
		song1.setTitle("meri maa ke barbar koi nhi");
		song1.setArtist("jubin noutiyal");
		song1.setDuration(4.00);
		song1.setAlbum(album1);
		dao.save(song1);

		Album album11 = (Album) dao.fetchById(Album.class, 1);
		Song song11 = new Song();
		song11.setTitle("hum sath sath hai");
		song11.setArtist("pata ni kon hai");
		song11.setDuration(4.00);
		song11.setAlbum(album11);
		dao.save(song11);

		dao.delete(Song.class, 2);
	}

}
