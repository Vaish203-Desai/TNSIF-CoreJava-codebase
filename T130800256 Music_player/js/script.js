
const songs = [
  {
    title: "Tera Ban Jaunga",
    artist: "Akhil Sachdeva",
    file: "songs/tera_ban_jaunga.mp3",
    image: "images/tera_ban_jaunga.jpg"
  },
  {
    title: "Tum Hi Ho",
    artist: "Arijit Singh",
    file: "songs/tum_hi_ho.mp3",
    image: "images/tum_hi_ho.jpg"
  }
  // Add more here
];


let currentIndex = 0;
const audio = document.getElementById('audio');
const title = document.getElementById('song-title');
const artist = document.getElementById('artist');
const albumArt = document.getElementById('album-art');
const playlist = document.getElementById('playlist');

function loadSong(index) {
    const song = songs[index];
    audio.volume = 1.0;
    audio.src = song.file;
    title.textContent = song.title;
    artist.textContent = song.artist;
    albumArt.src = song.image;
}

function togglePlay() {
    if (audio.paused) audio.play();
    else audio.pause();
}

function nextSong() {
    currentIndex = (currentIndex + 1) % songs.length;
    loadSong(currentIndex);
    audio.play();
}

// Load first song on page load
window.onload = () => {
    loadSong(currentIndex);
};
