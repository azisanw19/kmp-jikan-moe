//
//  AnimeListScreenViewModel.swift
//  iosApp
//
//  Created by Aziz Anwar on 08/03/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared

extension AnimeListScreen {
    
    @MainActor class AnimeListViewModel: ObservableObject {
        private var animeListUseCase: AnimeListUseCase? = nil
        
        @Published private(set) var animeResultData = [AnimeResultData]()
        
        init(animeListUseCase: AnimeListUseCase? = nil) {
            self.animeListUseCase = animeListUseCase
        }
        
        func fetchAnimeList() {
            animeListUseCase?.invoke(completionHandler: { result, error in
                if let resultSuccess = result as? ResultSuccess {
                    self.animeResultData = resultSuccess.data as! [AnimeResultData]
                } else {
                    // Error
                }
            })
            
        
        }
        
        func setAnimeListUseCase(animeListUseCase: AnimeListUseCase) {
            self.animeListUseCase = animeListUseCase
        }
        
        
    }
    
}
