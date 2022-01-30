package mz.co.blog.api.album.persistence;

import mz.co.blog.api.album.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
