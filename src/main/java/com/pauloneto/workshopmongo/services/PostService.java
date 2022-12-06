package com.pauloneto.workshopmongo.services;

import com.pauloneto.workshopmongo.domain.Post;
import com.pauloneto.workshopmongo.domain.User;
import com.pauloneto.workshopmongo.dto.UserDTO;
import com.pauloneto.workshopmongo.repository.PostRepository;
import com.pauloneto.workshopmongo.repository.UserRepository;
import com.pauloneto.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
