//
//  AnimeListScreen.swift
//  iosApp
//
//  Created by Aziz Anwar on 08/03/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct AnimeListScreen: View {
    
    private var animeListUseCase: AnimeListUseCase
    @StateObject var viewModel: AnimeListViewModel = AnimeListViewModel(animeListUseCase: nil)
    
    init(animeListUseCase: AnimeListUseCase) {
        self.animeListUseCase = animeListUseCase
    }
    
    var body: some View {
        VStack {
            Text("Hello World")
            
            List {
                ForEach(viewModel.animeResultData, id: \.self) { animeResultData in
                    Text(animeResultData.synopsis ?? "Empty")
                }
            }.onAppear {
                viewModel.fetchAnimeList()
            }
        }.onAppear {
            viewModel.setAnimeListUseCase(animeListUseCase: animeListUseCase)
            viewModel.fetchAnimeList()
        }
    }
}

